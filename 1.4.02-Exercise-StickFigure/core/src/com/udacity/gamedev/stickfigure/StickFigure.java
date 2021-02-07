package com.udacity.gamedev.stickfigure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * TODO: Start here
 *
 * In this exercise you'll set up a ShapeRenderer, and use it to draw a stick figure. At minimum,
 * you'll need a circle for the head, and five lines for the torso, arms, and legs.
 *
 * Remember to set up a ShapeRenderer you'll need to declare it, initialize it, and dispose of it.
 * Then to actually use the ShapeRenderer you'll need to start a batch of the appropriate type, draw
 * your shapes, and end the batch.
 *
 * We don't have step-by-step TODOs for this one, since the aim is for you to remember the steps for
 * setting up a ShapeRenderer and be able to set one up on your own. Of course, the solution is
 * available if you run into anything confusing.
 */
public class StickFigure extends ApplicationAdapter {

    private ShapeRenderer shapeRenderer;

    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        /* ------
           ANSWER
           ------
         */
        int width = Gdx.graphics.getWidth();
        int height = Gdx.graphics.getHeight();

        int headx = width / 2;
        int heady = height * 3 / 4;

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(Color.WHITE);
            shapeRenderer.circle(headx, heady, 50);
        shapeRenderer.end();

        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
            shapeRenderer.setColor(Color.WHITE);
            shapeRenderer.line(headx, heady, headx, heady - 250); // corpo

            shapeRenderer.line(headx, heady - 80, headx - 60, heady - 120); // braço direito
            shapeRenderer.line(headx, heady - 80, headx + 60, heady - 120); // braço esquerdo

            shapeRenderer.line(headx, heady - 250, headx - 60, heady - 320); // perna direito
            shapeRenderer.line(headx, heady - 250, headx + 60, heady - 320); // perna esquerda
        shapeRenderer.end();

        /* --------
           SOLUTION
           --------
         */

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        // Head
        shapeRenderer.circle(100, 100, 10);
        shapeRenderer.end();

        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);

        // Torso
        shapeRenderer.line(100, 50, 100, 100);

        // Legs
        shapeRenderer.line(85, 35, 100, 50);
        shapeRenderer.line(115, 35, 100, 50);

        // Arms
        shapeRenderer.line(85, 70, 100, 85);
        shapeRenderer.line(115, 70, 100, 85);
        shapeRenderer.end();
    }
}
