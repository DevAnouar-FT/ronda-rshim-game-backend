package com.ronda_rshim.gateway;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.ext.web.Router;
import io.vertx.core.json.JsonObject;

public class MainVerticle extends AbstractVerticle {
  @Override
  public void start(Promise<Void> startPromise) {
    Router router = Router.router(vertx);
    router.get("/healthz").handler(ctx -> {
      ctx.response()
        .putHeader("Content-Type", "application/json")
        .end(new JsonObject().put("status", "up").encode());
    });

    vertx.createHttpServer()
      .requestHandler(router)
      .listen(8080, http -> {
        if (http.succeeded()) {
          System.out.println("✅ Gateway started on port 8080");
          startPromise.complete();
        } else {
          startPromise.fail(http.cause());
        }
      });
  }
}
