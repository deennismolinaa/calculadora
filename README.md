$ git init (iniciamos el repositorio)

$ git remote add origin https://github.com/deennismolinaa/calculadora.git (vinculamos el repositorio con el remoto)

$ git checkout -b main (creamos la rama main y nos quedamos en ella)

$ echo "DENNIS-CALCULADORA" > README.md (creamos el archivo README.md)

$ git add README.md (añadimos README.md)

$ git commit -m "Calculadora Ejercicio 1" (guardamos los cambios con un pequeñp mensaje)
[main (root-commit) 1a83605] Calculadora Ejercicio 1
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

$ git push -u origin main (subimos la rama main al repositorio)

$ git branch backend (creamos una nueva rama llamada backend)

$ git branch frontend (creamos una nueva rama llamada frontend)

$ git push -u origin backend (subimos la rama backend al repositorio)
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 245 bytes | 245.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'backend' on GitHub by visiting:
remote:      https://github.com/deennismolinaa/calculadora/pull/new/backend
remote:
To https://github.com/deennismolinaa/calculadora.git
 * [new branch]      backend -> backend
branch 'backend' set up to track 'origin/backend'.

$ git push -u origin frontend (subimos la rama frontend al repositorio)
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'frontend' on GitHub by visiting:
remote:      https://github.com/deennismolinaa/calculadora/pull/new/frontend
remote:
To https://github.com/deennismolinaa/calculadora.git
 * [new branch]      frontend -> frontend
branch 'frontend' set up to track 'origin/frontend'.

$ git checkout frontend (cambiamos a la rama frontend)
D       README.md
Switched to branch 'frontend'
Your branch is up to date with 'origin/frontend'.

$ touch calculadora1.java (creamos el archivo)

$ git add calculadora1.java (lo añadimos)

$ git commit -m "Añadimos la parte java" (lo guardamos con un pequeño mensaje)
[frontend 6f943a9] Añadimos la parte java
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 calculadora1.java

$ touch calculadora2.html (creamos el archivo)

$ git add calculadora2.html (lo añadimos)

$ git commit -m "Añadimos la parte html" (lo guardamos con un pequeño mensaje)
[frontend 6f943a9] Añadimos la parte html
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 calculadora2.html

$ git push origin frontend (subimos los commits al repositorio)
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 301 bytes | 301.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/deennismolinaa/calculadora.git
   1a83605..6f943a9  frontend -> frontend

$ git checkout main (volvemos a la rama main)
D       README.md
Switched to branch 'main'

$ git merge backend (fusionamos los cambios en el main )
Already up to date.

$ git merge frontend (fusionamos los cambios en el main )
Updating 1a83605..6f943a9
Fast-forward
 calculadora2.html | 0
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 calculadora2.html


