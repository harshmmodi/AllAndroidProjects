package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Computer_Graphics extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer__graphics);

        lv = (ListView)findViewById(R.id.lvGraph);
        list.add("Introduction:\nBrief discussion on historical perspective; graphics primitives such as points, lines, polygons,etc.; representation of pictures using primitives; storage & retrieval of pictures; introduction to graphics display devices; calligraphic/ vector graphics versus raster graphics; bit plane; colour look-up table; introduction to graphic input devices – track ball, mouse, digitizing tablet, light pen, etc.\n");
        list.add("Rasterization techniques: \n" +
                "Line – DDA; Bresenham’s generalized integer version; Mid-point rasterization." +
                "Circle – Bresenham’s algorithm; Mid-Point algorithm - 1st order difference & 2nd order difference " +
                "methods. " +
                "Ellipse – Mid-Point algorithm - 1st order difference method, brief discussion on 2nd order " +
                "difference method\n");
        list.add("2D Scan conversion & polygon filling:\n" +
                "Active-Edge-List (y-bucket) scan conversion of lines & polygons; " +
                "Edge –fill , Fence –fill, & Edge –flag polygon filling algorithms; simple Seed –fill & Scan –line " +
                "seed –fill algorithms.\n");
        list.add("2D Geometric transformations:\n" +
                "Introduction to position vector; representation of 2D objects as matrices; transformation matrices " +
                "for scaling, shear, rotation, reflection " +
                "homogeneous coordinates; representing translation as a transformation matrix; composite " +
                "transformation matrix for arbitrary transformation; invariance of origin under transformation; " +
                "invariance of parallelism under transformation; transformation of intersecting lines; area of " +
                "transformed polygons; 2D view-port & viewing window.\n");
        list.add("2D Clipping:\n" +
                "Clipping against regular window – Explicit line clipping; " +
                "Sutherland & Cohen line clipping, " +
                "Mid-point subdivision line clipping; " +
                "Clipping against arbitrary convex window – Cyrus Beck clipping algorithm, " +
                "Liang Barsky clipping algorithm; " +
                "Sutherland & Hodgemann polygon clipping.\n");
        list.add("3D Graphics:\n" +
                "Indroduction to right handed coordinate system for 3D representation; matrix representation of " +
                "3D object; scaling, shear & translation transformation; [1L] " +
                "rotation about principal coordinate axes & about arbitrary line; composite transformation for " +
                "arbitrary 3D transformation.\n");
        list.add("Projection:\n" +
                "Introducing the idea of projecting 3D object on to 2D plane; broad classification – parallel & " +
                "perspective projection; different types of parallel projection & examples of each; " +
                "formal definition of 3D to 2D projection and derivation of projection matrix; 1-point, 2-point & " +
                "3-point perspective projection; formal derivation of vanishing point(s) and physical implication of " +
                "the same.\n");
        list.add("Curves:\n" +
                "Introduction to curve fitting; piece-wise approximation using known curves; approximation using " +
                "different functions – polynomial, exponential, trigonometric etc.; " +
                "Introduction to blending function; detailed illustration by creating a hypothetical polynomial " +
                "blending function; " +
                "general spline; cubic spline; B- spline; Hermite curve; boundary & continuity conditions for these " +
                "curves; " +
                "Bezier curve; 1st & 2nd order continuity conditions for joining Bezier curves; splitting Bezier " +
                "curve;\n");
        list.add("Hidden line removal:\n" +
                "Introduction; simple z-buffer algorithm; scan line z-buffer algorithm; floating horizon algorithm.\n");
        list.add("Basic interaction handling:\n" +
                "Different classes of devices – locator, pick, valuator etc.; input & output handling in a window " +
                "system.\n");
        list.add("Illumination & shading:\n" +
                "Introduction; basic illumination models; ambient, diffused and specular reflection light models; " +
                "simple flat/ faceted shading; Gourad shading; Phong shading; simple ray tracing algorithm.\n");
        list.add("Suggested Readings:\n" +
                "1. Procedural Elements for Computer Graphics by David F.Rogers, TMH publication.\n" +
                "2. Mathematical Elements for Computer Graphics by David F. Rogers and J. A. Adams, TMH publication.\n");


        adapter = new ArrayAdapter(Computer_Graphics.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);


    }
}
