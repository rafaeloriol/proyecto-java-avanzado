# proyecto-java-avanzado

Creación y configuración de aplicación con SpringBoot y Jersey desde Intellij Idea.
Crear un controlador para coches, con un método que reciba un string por parámetro de url
indicando el tipo de coche que quiere recibir. Existen tres tipos de coches: eléctrico, híbrido y de
combustión.

El controlador recibe el parámetro e invoca a un Factory Method que le proporciona el coche
solicitado y lo devuelve como respuesta json. El Factory Method utiliza una Fachada para la
creación de los coches, donde cada uno está compuesto por diferentes piezas como batería, motor,
aire acondicionado, inyección, etc. El controlador recibe un coche en marcha, con la batería, el
motor y el aire acondicionado encendidos. Cada tipo de coche debería tener al menos una pieza
diferente al resto de tipos de coches.

En caso de no existir el tipo de coche indicado en la url de la petición, el Factory Method lanzará
una excepción, que el controlador capturará y registrará en los logs, enviando al cliente una
respuesta de tipo not found (404).

Crear una colección en postman y comprobar que se recuperan los datos correctamente. Exportar la
colección y cargarla en el directorio raíz del proyecto.
