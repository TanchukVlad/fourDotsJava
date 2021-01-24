# fourDotsJava
This program is an interview challenge. Program was written in Java. 


## Task
There are coordinates of four dots (can be typed in or downloaded from a file).
You need to identify if 1 of the dots will be within the triangle made out of the other three dots.


## About program
Point position (inside or outside of the triangle) is recognized using this algorithm:

    1. Chose three points for the triangle and one required point;
    2. Creat 1 main triangle (with p1,p2,p3) and 3 triangles with the required point (p4).
    3. Calc all sides and areas of these triangles.    
    4. Compare the sum of areas of 3 triangles with main triangle:
     
        - if sum is equal to main     -> required point is inside of triangle.
        - if sum is not equal to main -> required point is outside of triangle.
    5. Repeat this algorithm for other combinations of points.
