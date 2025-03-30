FROM nats:2.9-alpine

COPY nats.conf /nats.conf

# NATS default port
EXPOSE 4222

CMD ["-c", "/nats.conf"]
