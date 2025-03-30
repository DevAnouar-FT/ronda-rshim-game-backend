docker_compose('docker-compose.yml')

docker_build(
    'ronda-rshim-game-backend_gateway',
    './services/gateway',
    dockerfile='./services/gateway/Dockerfile.dev',
    live_update=[
      sync("./services/gateway/src", "/app/src"),
      run('echo "Triggering redeploy..."', trigger='./services/gateway/src'),
    ]
) if os.path.exists('./services/gateway/Dockerfile.dev') else local_resource('no-gateway-service', 'echo "No API Gateway service is set-up.\nPlease ensure you have the folder structure for the service under services/gateway/, with a Dockerfile.dev file."')

docker_build(
    'ronda-rshim-game-backend_game-engine',
    './services/game-engine',
    dockerfile='./services/game-engine/Dockerfile',
    live_update=[
      sync("./services/game-engine/src", "/app/src"),
      # run(""),  # To restart process
    ]
) if os.path.exists('./services/game-engine/Dockerfile') else local_resource('no-game-engine-service', 'echo "No Game-Engine service is set-up.\nPlease ensure you have the folder structure for the service under services/game-engine/, with a Dockerfile.dev file."')

docker_build(
    'ronda-rshim-game-backend_nats',
    './services/nats',
    dockerfile='./services/nats/Dockerfile',
    live_update=[
      sync("./services/nats/src", "/app/src"),
      # run(""),  # To restart process
    ]
) if os.path.exists('./services/nats/Dockerfile') else local_resource('no-nats-service', 'echo "No Nats service is set-up.\nPlease ensure you have the folder structure for the service under services/nats, with a Dockerfile.dev file."')

# Uncomment when ready to use Redis
# docker_build(
#     'ronda-redis',
#     './services/redis',
#     dockerfile='./services/redis/Dockerfile',
#     live_update=[
#       sync("./services/redis/src", "/app/src"),
#       # run(""),  # To restart process
#     ]
# ) if os.path.exists('./services/redis/Dockerfile') else local_resource('no-redis-service', 'echo "No Redis service is set-up.\nPlease ensure you have the folder structure for the service under services/redis/, with a Dockerfile."')
