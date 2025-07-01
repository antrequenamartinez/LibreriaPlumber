# Librería Plumber

## Descripción

**Librería Plumber** es una librería Java pensada para facilitar la **gestión de obras y facturación** en empresas de fontanería. Define un conjunto de clases reutilizables para representar clientes, obras, reparaciones, instalaciones y materiales.

---

## Características Principales

- Creación y gestión de **obras** de tipo _reparación_ e _instalación_.
- Asociación de obras con clientes y materiales.
- Preparación de datos para **generación de facturas**.

---

## Estructura del Proyecto

![Diagrama de Clases](./diagrama/DiagramaClases.png)

## Instalación

### Usando JitPack

1. Añade el repositorio de JitPack en tu `build.gradle`:

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

2. Añade la dependencia:

```groovy
dependencies {
    implementation 'com.github.[USUARIO]:libreria-plumber:[VERSION]'
}
```
## Acciones Disponibles

- Crear obras (Reparación / Instalación)
- Asociar materiales y clientes
- Obtener información para generar facturas

---

## Requisitos

- Java 8 o superior
- Gradle 7.0 o superior

---
