La clase **StdDraw** ha sido programada por Robert Sedgewick, profesor de la _Universidad de Princeton_ y autor de algunos conocidos libros de computación, para ser utilizada en el contexto de las clases de 1er curso de las carreras de informática de esa universidad.
La he tuneado un poco para darle más funcionalidad.

Para esta aproximación a las animaciones y los juegos vamos a utilizar éste _framework_, que es bastante sencillo e intuitivo.

<iframe src="//www.youtube.com/embed/gZV5jVF8lJ8" height="197" frameborder="0" width="350"></iframe>

También vamos a poder jugar un poco con el sonido. La clase **StdSound** la he programado yo con recortes de aquí y de allá, y permite la reproducción asíncrona (sin pausar la ejecución) de sonido, bien de onda de audio (en formato .wav o .au) o una secuencia de música (en formato .mid).

- - - 

Descarga la libería que incluye ambas clases aquí: [StdDrawSound.jar](https://github.com/vjfernandez/stddraw/raw/master/StdDrawSound/StdDrawSound.jar) , e inclúyela en la carpeta _lib/userlib_ de BlueJ. Alternativamente, también puedes guardarla donde quieras, y añadirla a la lista de librerías que carga BlueJ con la opción del menú _Tools/Preferences/Libraries/Add_

Ninguna de las dos clases se instancia. Todos sus métodos son estáticos y se encuentran el paquete _org.daw1_. (Conviene hacer `import org.daw1.*`.

(Consulta el javadoc que está en la página de la asignatura tras éste documento).
En Bluej, en la versión portable o la de Windows, puedes guardar ésta librería en la carpeta lib/userlib, dentro de la carpeta de instalación de BlueJ, y quedará incorporada para ser utilizada en cualquier proyecto.

- - -

En linux, la carpeta userlib está en /usr/share/bluej/userlib. La librería está compilada para java 8. 
