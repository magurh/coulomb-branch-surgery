[![arXiv:2404.02955](http://img.shields.io/badge/hep.th-arXiv%3A2404.02955-B31B1B.svg)](https://arxiv.org/abs/2404.02955) 
[![License: GPLv3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
<img src="https://img.shields.io/badge/-Wolfram Mathematica-DD1100?style=flat&logo=wolframmathematica&logoColor=white"/>

# Coulomb branch surgery


This repository is a collection of notebooks and tools useful for analyzing the Seiberg-Witten geometry of four-dimensional supersymmetric field theories, with $\mathcal{N} = 2$ supersymmetry. The repository accompanies the following paper:

[1] E. Furrer and H. Magureanu, <i>Coulomb branch surgery: Holonomy saddles, S-folds and discrete symmetry gaugings</i>, <a href="https://arxiv.org/abs/2404.02955">2404.02955</a>.

The repository includes the following files:

<ul>
  <li><b>Seiberg-Witten_curves.nb</b> - a notebook that includes the Seiberg-Witten curves for the 5d $\mathcal{N}=1$ Seiberg $E_n$ theories, as well as 4d SQCD curves.</li>
  <li><b>Persson_list.nb</b> - a notebook including Persson's complete list of rational elliptic surfaces (RES) and various manipulations.</li>
  <li><b>Character_Decomposition.nb</b> - a notebook for finding specific RES from a group theory perspective.</li>
  <li><b>RES_Torsion_Sections.nb</b> - a notebook for finding torsion sections of a RES and computing intersections with singular fibers.</li>
  <li><b>FunDomain.java</b> - a java applet for drawing fundamental domains.</li>
  <li><b>Monodromies.nb</b> - a notebook for computing monodromies and BPS charges, to be used together with the java applet.</li>
  <li><b>Amoeba_projection.nb</b> - a notebook for computing Amoeba projections of toric polytopes.</li>
  <li><b>Palette_for_tables.nb</b> - a palette for inserting tables into Mathematica.</li>
</ul>

<b>Each notebook comes with a ReadMe section inside.</b> We provide a brief description of their utility below. Some of these tools have also been used in the related works:

[2] C. Closset and H. Magureanu, <i>The $U$-plane of rank-one 4d $\mathcal{N} = 2$ KK theories</i>, <a href="https://scipost.org/10.21468/SciPostPhys.12.2.065">SciPost Phys. 12 (2022) 065</a>, <a href="https://arxiv.org/abs/2107.03509">2107.03509</a>.<br>
[3] J. Aspman, E. Furrer and J. Manschot, <i>Cutting and gluing with running couplings in $\mathcal{N} = 2$ QCD</i>, <a href="https://journals.aps.org/prd/abstract/10.1103/PhysRevD.105.025021">Phys. Rev. D 105 (2022) 025021</a>, <a href="https://arxiv.org/abs/2107.04600">2107.04600</a>.<br>
[4] H. Magureanu, <i>Seiberg-Witten geometry, modular rational elliptic surfaces and BPS quivers</i>, <a href="https://link.springer.com/article/10.1007/JHEP05(2022)163">JHEP 05 (2022) 163</a>, <a href="https://arxiv.org/abs/2203.03755">2203.03755</a>.<br>
[5] J. Aspman, E. Furrer, J. Manschot, <i>Four flavors, triality, and bimodular forms</i>, <a href="https://journals.aps.org/prd/abstract/10.1103/PhysRevD.105.025017">Phys. Rev. D 105 (2022) 025017</a>, <a href="https://arxiv.org/abs/2110.11969">2110.11969</a>.<br>
[6] C. Closset and H. Magureanu, <i>Reading between the rational sections: Global structures of 4d $\mathcal{N}=2$ KK theories</i>, <a href="https://arxiv.org/abs/2308.10225">2308.10225</a>.<br>


<br>

### `Seiberg-Witten_curves.nb`
----------------------------

We express the Seiberg-Witten curves for the 4d $\mathcal{N}=2$ KK theories obtained from the toroidal compactification of the 5d $\mathcal{N}=1$ rank-one $E_n$  SCFTs in two distinct ways:

<ol>
  <li> In terms of the $E_n$ flavour symmetry characters. </li>
  <li> In terms of gauge theory parameters. </li> 
 </ol>
	
For more details on how the mapping between the characters and the gauge theory parameters is realised, see [2, Appendix A]. The notebook also includes the SW curves of 4d SU(2) gauge theories with $N_f < 4$ fundamental flavours, in the original conventions of Seiberg and Witten.


<br>

### `Persson_list.nb`
----------------------------

The notebook includes Persson's complete list of rational elliptic surfaces, with an additional correction. The notebook can be used for finding specific configurations and tabulating for any desired theory by fixing certain singular fibers. Below is an example for the $E_4$ theory:

<p align="center">
  <img src="https://github.com/magurh/Coulomb-branch-surgery/assets/122356566/f2e7e96c-5dd0-413b-9b70-f1202ba1658c" width="800")
>
</p>


<br>

### `Character_Decomposition.nb`
----------------------------

This notebook runs on the GroupMath package and surves two main purposes:

<ol>
	<li> Finding configurations of singular fibers from character decomposition. </li>
  <li> Express characters in terms of gauge theory parameters. </li> 
 </ol>


<br>

### `RES_Torsion_Sections.nb`
----------------------------

This notebook can be used to find the (torsion) sections of rational elliptic surfaces (RES) and to compute their intersections with the singular fibers. Recall that in the Weierstrass model, a singular fiber is either a curve with a node, or a curve with a cusp.

<p align="center">
  <img src="https://github.com/magurh/Coulomb-branch-surgery/assets/122356566/4bc14462-0df6-4a5f-8bb6-f48c8b34aa41" width="600")
>
</p>


<br>

### `FunDomain.java`
----------------------------

This is a java Applet originally written by Helena Verill for drawing fundamental domains of subgroups of SL(2, Z). As the original website of the owner is down, I am uploading a slightly modified version of FunDomain, which maintains the same functionality. A separate ReadMe file is included in the fun_domain folder.

<p align="center">
  <img src="https://github.com/magurh/Coulomb-branch-surgery/assets/122356566/8e54bedf-a6a8-482e-9628-11f6ec6ee21f" width="600")
>
</p>


<br>

### `Monodromies.nb`
----------------------------

This notebook can be used together with the FunDomain java applet for changing fundamental domains. It includes a range of functions for computing coset representatives, monodromies, and more.


<br>

### `Amoeba_projection.nb`
----------------------------

This code is an example of how to implement the amoeba projection for any toric polygon. The implementation follows D. Bogdanov's online tool at http://dvbogdanov.ru/amoeba. See also:

[7] D. Bogdanov, A. A. Kytmanov and T. M. Sadykov, Algorithmic computation of polynomial amoebas, in International Workshop on Computer Algebra in Scientific Computing, pp. 87-100, Springer, 2016.

<p align="center">
  <img src="https://github.com/magurh/Coulomb-branch-surgery/assets/122356566/f8e0fd99-870c-4cb8-aed3-d3602477c9ab" width="200")
>
</p>


<br>

### `Palette_for_tables.nb`
----------------------------

This notebook offers a palette for importing tables. The directions for using it are rather straightforward and provided in the notebook. All credits go to @Szabolcs Horvát: https://github.com/szhorvat/TablePaste/.
