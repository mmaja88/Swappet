FROM nginx:alpine

COPY build /usr/share/nginx/html

# Izlozi port
EXPOSE 8081

# Kopira konfiguraciju nginx-a
COPY nginx.conf /etc/nginx/conf.d/default.template

# postavlja entrypoint
ENTRYPOINT ["/bin/sh", "-c", "envsubst '${BACKEND_URL}' < /etc/nginx/conf.d/default.template > /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'"]