# 💱 Conversor de Monedas en Java

Aplicación de consola desarrollada en **Java 17+** que permite convertir valores entre el dólar estadounidense (USD) y distintas monedas internacionales en tiempo real, utilizando la **API de ExchangeRate**.

---

## 🚀 Características

- Conversión **de USD a otras monedas** y viceversa.
- Datos actualizados mediante la API [ExchangeRate API](https://www.exchangerate-api.com/).
- Menú interactivo en consola.
- Código modular aplicando principios **SOLID** (responsabilidad única).
- Manejo automático de conversiones mediante una clase auxiliar (`OperacionesConversor`).

---

## 🧩 Estructura del proyecto

src/
├── Principal.java → Punto de entrada de la aplicación
├── ConsultaMonedas.java → Clase encargada de consumir la API
├── Moneda.java → Record que modela la respuesta JSON
├── Conversor.java → Contiene los métodos de cálculo
└── OperacionesConversor.java → Centraliza la lógica de conversión

---

## ⚙️ Tecnologías utilizadas

- **Java 17 o superior**
- **Gson** (para deserializar JSON)
- **HTTP Client (java.net.http)** (para la petición a la API)
- **API ExchangeRate v6**

---

## 🧠 Funcionamiento

1. El programa hace una petición HTTP a la API de ExchangeRate usando una **moneda base (USD)**.  
2. Obtiene un JSON con las tasas de conversión actualizadas.  
3. Muestra un menú con distintas opciones de conversión:
  Sea bienvenido/a al Conversor de Moneda

  1) Dólar => Peso argentino
  2) Peso argentino => Dólar
  3) Dólar => Real brasileño
  4) Real brasileño => Dólar
  5) Dólar => Peso colombiano
  6) Peso colombiano => Dólar
  7 Salir

  Elija una opción válida:
  
4. El usuario selecciona una opción, ingresa el valor, y el programa realiza el cálculo con las tasas actuales.

---

## 🔑 Requisitos

- Tener instalado **Java 17 o superior**  
- Tener acceso a internet (para la consulta de la API)
- Una cuenta en [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tu propia **API Key**

---

👨‍💻 Autor

Carlos Andrés Perdomo
📍 Colombia
💼 Proyecto educativo de práctica con Java

