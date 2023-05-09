# Challenge ONE | Back End | Foro Alura 

<p align="center" >
     <img width="200" heigth="200" src="https://user-images.githubusercontent.com/91544872/209678377-70b50b21-33de-424c-bed8-6a71ef3406ff.png">
</p>

### ¡Bienvenido al proyecto con la solución al desafío Foro Alura con Java y Spring! 


### EXPLICACIÓN:

#### ⭐El foro alura es un lugar donde todos los alumnos de la plataforma alura
pueden colocar sus preguntas sobre determinados cursos, este mágico lugar está lleno de mucho aprendizaje y de colaboración entre alumnos, profesores y moderadores.

#### 📚Nuestra API va a centrarse específicamente en los tópicos, y permite a los usuarios:

    Crear un nuevo tópico
    Mostrar todos los tópicos creados
    Mostrar un tópico específico
    Actualizar un tópico
    Eliminar un tópico

### 📃Tecnologías utilizadas:

SPRINT 1
  - [Eclipse](https://www.eclipse.org/)
  - [MySql](https://www.mysql.com/)
  - [Java](https://www.java.com/en/)

SPRINT 2
  - [Spring Security](https://start.spring.io/)
  - [Token JWT](https://jwt.io/)


#### 🔹 ¿Que hace nuestro proyecto?


## 🚧SPRINT 1


1 - En primer lugar permite la creacion de topicos, mediante el ingreso obligatorio de titulo, mensaje, autor y curso

<p align="center" >
  ![post](https://github.com/betangil238/Foro/assets/121052500/4f81f845-00c7-4344-b636-a405dbfab655)
</p>

2 - En segundo lugar podremos obtener todos los topicos creados o un topico especifico consultado por ID
<p align="center" >
  ![get1](https://github.com/betangil238/Foro/assets/121052500/b1621a22-f18e-4a09-8574-f90894a35fc9)
 </p>
 
 <p align="center" >
  ![get2](https://github.com/betangil238/Foro/assets/121052500/160d952f-0a51-42f3-b401-158d0cdbfde0)
 </p>


3 - En tercer lugar podremos actualizar un topico especificando el id en el cuerpo JSON, o directamente en la ruta especificando el id

<p align="center" >
![put1](https://github.com/betangil238/Foro/assets/121052500/b82d697a-00cd-4ce3-830d-b610dc29e750)

</p>

<p align="center" >
    ![put2](https://github.com/betangil238/Foro/assets/121052500/0d4a7c9d-810a-47b3-90df-f75c7144f9a6)

</p>

4 - finalmente tenemos la opcion de eliminar un topico

En este caso verificamos que el topico con id 11 existe en la base de datos
<p align="center" >
   ![delete](https://github.com/betangil238/Foro/assets/121052500/c48e21ee-88ed-4955-89e1-c397a3eed3d2)

</p>

Al eliminarlo nos retorna un codigo de protocolo HTTP 204 (¨Objeto eliminado con exito¨)
<p align="center" >
    ![delete1](https://github.com/betangil238/Foro/assets/121052500/0bd6bbea-7ad7-437e-8a7b-7a1499385a19)

</p>

finalmente lo verificamos consultandolo con los metodos anteriormente establecidos y con el manejo de errores adecuado

<p align="center" >
    ![delete2](https://github.com/betangil238/Foro/assets/121052500/c1e06114-8b4e-48b4-be7c-6cd09a766801)

</p>

en este caso obtenemos un codigo 404 que nos notifica efecticamente que se elimino correctamente

## 🚧SPRINT 2


💙 <strong>Linkedin</strong></br>
<a href="https://www.linkedin.com/in/daniel-betancur-giraldo-834291264/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

💙 <strong>Insignia de culminacion SPRINT 1</strong></br>

💙 <strong>Insignia de culminacion SPRINT 2</strong></br>



