# 🚗 Agencia de Automóviles

Este proyecto es una aplicación de escritorio desarrollada en **Java** con **JPA** y **MySQL**, que permite gestionar un catálogo de automóviles en venta. Implementa el **Modelo Vista Controlador (MVC)** y una capa de persistencia para asegurar una correcta separación de responsabilidades.

## 📌 Características

- 📝 **CRUD completo** para la gestión de automóviles.
- 🛠️ **Persistencia de datos** con JPA y MySQL.
- 🎨 **Interfaz gráfica** amigable para facilitar la administración.
- 📂 **Arquitectura MVC**, asegurando escalabilidad y mantenibilidad.

## 🏗️ Tecnologías Utilizadas

- **Java** (JDK 8+)
- **JPA** con EclipseLink
- **MySQL** como base de datos

## 📂 Estructura del Proyecto

```
com.bamioezequiel.automovilapp
│── AutomovilApp.java
│
├── igu
│   ├── LoadData.java
│   ├── Main.java
│   ├── ModifyData.java
│   ├── ViewData.java
│
├── logica
│   ├── Car.java
│   ├── Controller.java
│
├── persistencia
│   ├── CarJpaController.java
│   ├── ControllerPersistence.java
│   ├── exceptions
```

## 🗄️ Configuración de la Base de Datos

Este proyecto utiliza MySQL como base de datos. Asegúrate de que tienes un servidor MySQL en ejecución y usa las siguientes credenciales (puedes modificarlas en `persistence.xml`):

- **Base de datos:** `app_cars`
- **Usuario:** `root`
- **Contraseña:** *(vacía por defecto)*
- **URL de conexión:** `jdbc:mysql://localhost:3306/app_cars?serverTimezone=UTC`

## 🚀 Instalación y Uso

1. **Clonar el repositorio**
   ```sh
   git clone https://github.com/bamioezequiel/AgenciaAutos.git
   cd AgenciaAutos
   ```
2. **Configurar la base de datos**
   - Crear una base de datos en MySQL con el nombre `app_cars`.
   - Asegurar que el archivo `persistence.xml` contiene los datos correctos.

3. **Ejecutar la aplicación**
   - Importar el proyecto en **NetBeans** o cualquier otro IDE compatible con Java.
   - Compilar y ejecutar la clase `Main.java`.

[![Ver en Vimeo](https://img.shields.io/badge/Ver%20en-Vimeo-blue?style=for-the-badge&logo=vimeo)](https://vimeo.com/1059338888/e4aae87454)

## 📜 Licencia

Este proyecto se distribuye bajo la licencia **MIT**.

---

📌 **Desarrollado por [Ezequiel Bamio](https://github.com/bamioezequiel)**
