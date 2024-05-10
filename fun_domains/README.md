# FunDomain

FunDomain is a java program written by Helena A. Verrill for drawing fundamental domains of certain congruence subgroups of ${\rm SL}_2(\mathbb{Z})$ acting on the upper half complex plane.

As the original website of the owner is down, I am uploading a slightly modified version of FunDomain, which maintains the same functionality.

The original program is covered by the GNU GPL license.

To run the program, you need to have "javac" installed to compile the program, and "java" to run it. You can get these from: http://java.sun.com/j2se/.
If you already have java, you can find the version by typing
```
java -version
```

The program works for versions newer than 1.1.1. To compile the program, type in a command line:
```
javac FunDomain.java
```

To run the resulting program, type:
```
java FunDomain
```

A java applet should pop up.

<br>

General controls
-----------------

Using the orange coloured buttons to:

`Scale button`:             Change scale (in pixels per unit)

`Expand Rectangle button`:  Click on the screen and drag the mouse to form a rectangle. 
			  Then click on 'expand rectangle' and the scale changes so the height of the rectangle becomes the height of the screen.  
                          The center of the rectangle moves the the center of the screen (in vertical direction only).

`Colour choice buttons`:    Change colour of triangles

`<-- <- 0 -> --> buttons`:  Change position of the origin 
                          (Press "0" to put the origin in the center)

 
<br>

Fundamental domain drawing mode
--------------------------------

Draws Fundamental Domain for intersection of one of $\Gamma^0(N), \Gamma^1(N), \Gamma_0(N), \Gamma_1(N), \Gamma(N)$ with one of
$\Gamma^0(M), \Gamma^1(M), \Gamma_0(M), \Gamma_1(M), \Gamma(M)$.


<b>Type of group:</b>  There are choice buttons to choose which of the above types of groups to use.

<b>Changing N:</b>  Type in N, in the box provided, then click on `draw` 
             OR press the `>` and `<` buttons to increase N in steps.

<b>Changing M:</b>  Type in M, in the box provided, then click on `draw` 
             OR press the `>` and `<` buttons to increase N in steps.

<b>Edit Mode:</b>   Click on the `edit` button then you can move the triangles to give a different fundamental domain by clicking on the yellow circles on the boundaries of the triangles.

<b>Links Mode:</b>  Click on the `link` button to show how the boundary is linked up.

<b>Find matrix:</b> Click on a triangle to find out what the corresponding coset representative is, as a 2 by 2 matrix.

<br>

Triangle Drawing mode
----------------------

Here you can draw a triangle corresponding to transforming a standard domain by a given matrix. Currently only matrices of determinant 1 are allowed.

You can enter the matrix, by typing in the appropriate spaces on the right of the screen, and then click on "draw"
OR use the buttons $TM$, $RM$, etc to transform the matrix $M$. 
Matrices are: <br>

```math
T=  \begin{pmatrix} 1 & 1 \\\ 0 & 1 \end{pmatrix}, ~~~~~~~~~~~
 T'=\begin{pmatrix} 1 & -1 \\\ 0 & 1 \end{pmatrix},
```

```math
S=\begin{pmatrix} 0 & -1 \\\ 1 & 0 \end{pmatrix}, ~~~~~~~~~~~
R = \begin{pmatrix} 0 & -1 \\\ 1 & 1 \end{pmatrix}.
```

`move/copy`:  If move is selected, when the matrix is applied (eg, T, R, etc) the triangle is moved by this matrix.  
            If copy is selected, a copy is made, which is a translate by the applied matrix.

`Move to`:    this moves the origin so that the triangle just drawn is in the middle of the screen.

`Scale to`:   If you click on this, in addition to moving, it also scales, so the triangle just drawn is in the middle of the screen, 
            AND at a reasonable size so you can see it.


