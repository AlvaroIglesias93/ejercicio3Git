# ejercicio3Git

1. Creamos un repositorio nuevo en github con un README y un .gitignore

![001](https://user-images.githubusercontent.com/82227874/203109574-fdfdcc58-06aa-49db-a397-cd9ce9accf42.png)


2. Creamos un proyecto nuevo marcando la opción "Create Git repository"

![002](https://user-images.githubusercontent.com/82227874/203109705-462aa1b6-7649-41f9-ac80-e23d42668ac1.png)


3. Añadimos el repo de github como remoto e intentamos hacer un pull (recordemos que lo hemos creado con un README y un .gitignore)

![003](https://user-images.githubusercontent.com/82227874/203109815-b7ceecee-649a-49c6-bcdf-fc1ace6ea674.png)


No podemos hacer un pull por tener cambios en stage local que no hemos commiteado (los ficheros del proyecto local). Al crear el proyecto marcando la opción "Create Git repository", se ha hecho un git init y, aparentemente, se han añadido al stage (se ha hecho un git add) pero no hemos hecho un commit.


4. Quitamos los cambios del stage (deshacemos el git add)


![004](https://user-images.githubusercontent.com/82227874/203109997-ecb41867-84c1-487f-8d90-62d979a6db93.png)


5. Ahora los cambios están sin trackear. Intentamos de nuevo hacer un pull.


![005](https://user-images.githubusercontent.com/82227874/203110097-638080e7-ef1a-4b32-b473-f00ba0af9d80.png)

Al haber creado un .gitignore en remoto y otro en local, hay un conflicto entre estos ficheros.


6. Podemos eliminar el .gitignore local si queremos quedarnos con el remoto:


![006](https://user-images.githubusercontent.com/82227874/203110181-76ff3629-97f1-4b3f-9a12-e23b18b15972.png)


7. Ya tenemos descargado lo que estaba en remoto (el README y el .gitignore de GitHub) en la rama main (rama por defecto en GitHub) a nuestra rama master local.

Ahora commiteamos el proyecto local y lo subimos al repositorio.


![007](https://user-images.githubusercontent.com/82227874/203110262-7deee7fb-1d32-4cdb-bac8-44c83af5c951.png)


Observamos que se ha subido correctamente pero en la rama master (que era en la que estábamos trabajando en local), mientras que la rama main se mantiene con su primer commit.


8. Eliminamos la rama main en el repositorio de GitHub


![008](https://user-images.githubusercontent.com/82227874/203110447-f75954fb-812e-4e8a-96ce-94475fe75d11.png)


9. Modificamos el proyecto local (commit: "añadiendo código para probar las propiedades de Java")


![009](https://user-images.githubusercontent.com/82227874/203110544-93bbba21-e488-43a4-a50f-766274543365.png)


10. Creamos una nueva rama para corregir un bug:  


![010](https://user-images.githubusercontent.com/82227874/203110659-10a59d13-dea4-4e0f-9d5e-399bbda08d4f.png)


git checkout sirve para cambiar de commit (en este caso de rama, una rama es un identificador que apunta a un determinado commit --que es el último de su rama--'). La opción -b crea una rama nueva (no podríamos hacer checkout a una rama que no existe).



11. Corregimos este problem, commiteamos la corrección en la rama y la pusheamos.


![011](https://user-images.githubusercontent.com/82227874/203110748-6a483bca-32d6-461f-8be6-76a465ed1470.png)


12. Mergeamos a master la rama con el bug ya solucionado


![012](https://user-images.githubusercontent.com/82227874/203110794-746468fb-0939-4db0-abbf-0b54ff225f63.png)


13. Añado este README y la carpeta de imágenes.
