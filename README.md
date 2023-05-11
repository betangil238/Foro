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

![imagen](https://github.com/betangil238/Foro/assets/121052500/9e2adc9f-990f-4f3a-9919-bb5549b0ad95)

2 - En segundo lugar podremos obtener todos los topicos creados o un topico especifico consultado por ID

![imagen](https://github.com/betangil238/Foro/assets/121052500/4fb503b3-f655-41b7-bd6e-fd512e2a7edf)
 

![imagen](https://github.com/betangil238/Foro/assets/121052500/265fb88b-30b3-490a-86f3-95ce9e15dbad)



3 - En tercer lugar podremos actualizar un topico especificando el id en el cuerpo JSON, o directamente en la ruta especificando el id

![imagen](https://github.com/betangil238/Foro/assets/121052500/3722b757-a7a7-4183-a242-ab948a90e8db)



![imagen](https://github.com/betangil238/Foro/assets/121052500/4c502bae-41d4-4022-8dc4-ecb6e93702c8)


4 - finalmente tenemos la opcion de eliminar un topico

En este caso verificamos que el topico con id 11 existe en la base de datos

![imagen](https://github.com/betangil238/Foro/assets/121052500/16edae7c-36aa-4a88-93e9-4eefb952a111)

<p align="center" >
Al eliminarlo nos retorna un codigo de protocolo HTTP 204 (¨Objeto eliminado con exito¨)
</p>

![imagen](https://github.com/betangil238/Foro/assets/121052500/4b932922-7f93-473e-8c27-cb7c9bfe24ca)

<p align="center" >
finalmente lo verificamos consultandolo con los metodos anteriormente establecidos y con el manejo de errores adecuado
</p>

  ![imagen](https://github.com/betangil238/Foro/assets/121052500/f45ac0af-287e-4454-94c7-4d19caa0cb33)
<p align="center" >
en este caso obtenemos un codigo 404 que nos notifica efecticamente que se elimino correctamente
</p>
## 🚧SPRINT 2
1 - En este segundo sprint se nos solicito mediante spring security permitir la autenticacion de un cliente mediante
usuario y contrasena a fin de validar si este se encuentra activo en la base de datos.
Para este caso usamos un usuario : "admin" y contrasena: "admin" , en caso de no ingresar estos datos recibira un error 403

![imagen](https://github.com/betangil238/Foro/assets/121052500/a19fd5d1-9c5e-4f81-8076-06359ebe0a64)

![imagen](https://github.com/betangil238/Foro/assets/121052500/dd075a0c-77f4-4c78-8e04-1085032b2c9e)



2 - Al autenticarse el usuario, mediante JWT se le genera un token para ser implementado en las solicitudes del SPRINT 1, una vez ingresado este token
se le da la autorizacion al usuario para realizar solicitudes CRUD

![imagen](https://github.com/betangil238/Foro/assets/121052500/9917dbe8-6c26-4455-ba35-ab82c8231933)

De igual forma, si no se ingresa este token, se obtendra un 403

![imagen](https://github.com/betangil238/Foro/assets/121052500/a241909c-b0c6-4137-bd8c-0f04fda4af35)




💙 <strong>Linkedin</strong></br>
<a href="https://www.linkedin.com/in/daniel-betancur-giraldo-834291264/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

💙 <strong>Insignia de culminacion SPRINT 1</strong></br>

![imagen](https://github.com/betangil238/Foro/assets/121052500/d657b0eb-16be-428d-b174-f600a3d48875)


💙 <strong>Insignia de culminacion SPRINT 2</strong></br>



