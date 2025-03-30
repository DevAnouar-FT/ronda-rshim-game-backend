# Gateway Service (Vert.x)

## 🎯 Purpose

- Minimal HTTP + WebSocket Gateway
- Dev: hot-reload via Tilt + Vert.x dev mode
- Prod: built as fat JAR, runs via Docker Compose
- NATS-ready, not yet wired
- Health check at `/healthz`

## 🛠️ Run (Dev)
```bash
tilt up  # uses Dockerfile.dev and vertx:run
```

## 🛠️ Run (Prod)
```bash
docker compose up --build gateway
