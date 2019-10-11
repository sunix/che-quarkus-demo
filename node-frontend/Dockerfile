FROM node:12.2.0-alpine
RUN apk add bash

RUN yarn global add serve

COPY ./build /app
COPY .env /.env
RUN chmod -R g+rwx /app

COPY entrypoint.sh /entrypoint.sh
RUN chmod g+rwx entrypoint.sh

ENTRYPOINT [ "/entrypoint.sh" ]
CMD [ "serve", "-l", "8080", "-s", "/app"]
