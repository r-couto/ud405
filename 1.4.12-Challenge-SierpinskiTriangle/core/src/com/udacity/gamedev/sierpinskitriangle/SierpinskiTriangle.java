package com.udacity.gamedev.sierpinskitriangle;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;

/**
 * TODO: Start here
 *
 * Your challenge, should you choose to accept it, is to draw a Serpinski Triangle. I offer no hints
 * beyond the fact that ShapeRenderer has a very convenient triangle() function, and that using a
 * FitViewport can simplify matters considerably. Good luck!
 */


public class SierpinskiTriangle extends ApplicationAdapter {

    static final float SIZE = 10;
    private static final int RECURSIONS = 7;
    private static final float WORLD_WIDTH = 50.0f;
    private static final float WORLD_HEIGHT = 50.0f;
    private static final float BEGIN_POSITION_X = 0.0f;
    private static final float BEGIN_POSITION_Y = 0.0f;

    ShapeRenderer renderer;
    FitViewport viewport;

    @Override
    public void create() {
        renderer = new ShapeRenderer();
        viewport = new FitViewport(WORLD_WIDTH, WORLD_HEIGHT);
    }

    @Override
    public void dispose() {
        renderer.dispose();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
        renderer = new ShapeRenderer();

        viewport.getCamera().position.set(BEGIN_POSITION_X + 5, BEGIN_POSITION_Y - 5, 0);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        viewport.apply();
        renderer.setProjectionMatrix(viewport.getCamera().combined);

        renderer.begin(ShapeRenderer.ShapeType.Filled);
        renderer.setColor(Color.WHITE);
        drawTriangles(renderer);
        renderer.end();
    }

    private void drawTriangles(ShapeRenderer renderer) {
        renderer.triangle(BEGIN_POSITION_X, BEGIN_POSITION_Y, BEGIN_POSITION_X + 10, BEGIN_POSITION_Y, BEGIN_POSITION_X + 5, BEGIN_POSITION_Y - 8);

        float v1x = BEGIN_POSITION_X;
        float v1y = BEGIN_POSITION_Y;
        float v2x = BEGIN_POSITION_X + 10;
        float v2y = BEGIN_POSITION_Y;
        float v3x = BEGIN_POSITION_X + 5;
        float v3y = BEGIN_POSITION_Y - 8;


        for (int i = 0; i < 10; i++) {

        }

    }
}