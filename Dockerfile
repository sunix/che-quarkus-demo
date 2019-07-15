# Copyright (c) 2018 Red Hat, Inc.
# This program and the accompanying materials are made
# available under the terms of the Eclipse Public License 2.0
# which is available at https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#
# Contributors:
#   Sun Tan

###
# Builder Image
#
FROM quay.io/quarkus/centos-quarkus-maven:graalvm-1.0.0-rc16 as builder

COPY sunix-quarkus-demo /projects/sunix-quarkus-demo
WORKDIR /projects/sunix-quarkus-demo
RUN mvn package -Pnative

FROM registry.fedoraproject.org/fedora-minimal as runtime
WORKDIR /work/
COPY --from=builder /projects/sunix-quarkus-demo/target/sunix-quarkus-demo-1.0-SNAPSHOT-runner /work/application
RUN chmod 775 /work
EXPOSE 8080
CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]
