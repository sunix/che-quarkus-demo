FROM docker.io/eclipse/che-remote-plugin-kubernetes-tooling-1.0.0:next


ENV ODO_VERSION=v0.0.20 \
    OC_VERSION=v3.11.0 \
    OC_TAG=0cbc58b

# the plugin executes the commands relying on Bash
RUN # install odo
    curl https://github.com/openshift/odo/releases/download/${ODO_VERSION}/odo-linux-amd64 -o /usr/local/bin/odo && \
    chmod +x /usr/local/bin/odo && \
    # install oc
    curl -o- -L https://github.com/openshift/origin/releases/download/${OC_VERSION}/openshift-origin-client-tools-${OC_VERSION}-${OC_TAG}-linux-64bit.tar.gz | tar xvz -C /usr/local/bin --strip 1



