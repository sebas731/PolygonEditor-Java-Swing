🎨 Polygon Editor - Java Swing
<div align="center">
Mostrar imagen
Mostrar imagen
Mostrar imagen
Editor interactivo de polígonos con manipulación dinámica de formas y personalización de colores en tiempo real
📸 Ver Demo • 🚀 Instalación • 💻 Uso
</div>

✨ Características principales
🔷 Creación de polígonos personalizados

Triángulos, cuadrados y formas n-laterales
Agregar puntos dinámicamente para transformar la forma
Sistema de coordenadas intuitivo

🎨 Personalización completa de colores

Color de relleno del polígono
Color de los bordes/líneas
Color de los puntos de control (vértices)
Selector de colores RGB integrado

✏️ Edición interactiva

Arrastre de vértices para modificar la forma
Agregar nuevos puntos con un click
Panel de dibujo dedicado separado de los controles
Actualización en tiempo real del polígono

🖼️ Interfaz gráfica profesional

Diseño limpio con JFrame
Controles organizados y accesibles
Vista previa instantánea de cambios
Experiencia de usuario fluida


🖼️ Capturas de pantalla

[Agrega aquí capturas de tu aplicación mostrando diferentes polígonos y opciones de color]

📸 Próximamente: Screenshots del editor en acción

🛠️ Tecnologías utilizadas
TecnologíaUsoJava 8+Lenguaje principalSwingFramework de interfaz gráficaJFrameVentana principal de la aplicaciónJPanelPanel personalizado de dibujoGraphics2DRenderizado de formas geométricasAWTManejo de eventos y colores

📋 Requisitos previos

JDK 8 o superior instalado
IDE recomendado: NetBeans, IntelliJ IDEA o Eclipse
Sistema operativo: Windows, macOS o Linux


🚀 Instalación
Opción 1: Clonar y ejecutar desde IDE
bash# Clonar el repositorio
git clone https://github.com/sebas731/PolygonEditor-Java-Swing.git

# Navegar al directorio
cd PolygonEditor-Java-Swing

# Abrir en NetBeans
# File → Open Project → Seleccionar la carpeta PolygonEditor-Java-Swing

# Ejecutar (F6 en NetBeans)
Opción 2: Compilar desde línea de comandos
bash# Compilar
javac -d bin src/*.java

# Ejecutar
java -cp bin Main

💻 Uso
Inicio rápido

Ejecuta la aplicación

Click derecho en el proyecto → Run
O presiona F6 en NetBeans


Selecciona una forma base

Elige triángulo o cuadrado desde el menú


Personaliza los colores

Click en los botones de color para:

🎨 Color de relleno
🖊️ Color de líneas
📍 Color de puntos




Modifica la forma

Click en el panel para agregar puntos
Arrastra vértices existentes para cambiar la geometría


Experimenta

Crea formas de 3, 4, 5+ lados
Combina diferentes colores
Observa los cambios en tiempo real




🏗️ Estructura del proyecto
PolygonEditor-Java-Swing/
│
├── src/                          # Código fuente Java
│   ├── Main.java                 # Clase principal con método main()
│   ├── VentanaPrincipal.java     # JFrame - Ventana principal
│   ├── PanelDibujo.java          # JPanel - Panel de renderizado
│   ├── Poligono.java             # Modelo - Clase polígono
│   └── ControladorColor.java     # Controlador de colores
│
├── nbproject/                    # Configuración de NetBeans
├── .gitignore                    # Archivos ignorados por Git
└── README.md                     # Este archivo

🎯 Conceptos de POO aplicados
Este proyecto demuestra sólidos principios de Programación Orientada a Objetos:
✅ Encapsulación

Clase Poligono encapsula datos de vértices y colores
Getters y setters para acceso controlado

✅ Separación de responsabilidades

VentanaPrincipal: Interfaz y controles
PanelDibujo: Lógica de renderizado
Poligono: Modelo de datos

✅ Event-Driven Programming

Listeners para mouse events (click, drag)
Action listeners para botones de color
Observers para actualización de vista

✅ Abstracción

Clase abstracta para formas geométricas
Interfaces para comportamientos comunes


🧠 Algoritmos implementados

Detección de puntos: Algoritmo para detectar click cercano a vértices
Renderizado: Graphics2D para dibujo eficiente de polígonos
Transformación de coordenadas: Conversión entre coordenadas de pantalla y modelo
Hit detection: Detección de área clickeable en vértices


🔮 Roadmap - Próximas características

 💾 Guardar y cargar polígonos desde archivo JSON
 📐 Formas predefinidas adicionales (pentágono, hexágono, estrella)
 ↩️ Función Deshacer/Rehacer (Undo/Redo)
 📏 Mostrar dimensiones y ángulos del polígono
 🖼️ Exportar como imagen PNG/JPG
 🔄 Rotar y escalar polígonos
 📋 Copiar/Pegar polígonos
 🎨 Gradientes y patrones de relleno
 ⚙️ Ajustes de grosor de línea


🤝 Contribuciones
¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto:

🍴 Haz fork del repositorio
🔧 Crea una rama para tu feature (git checkout -b feature/NuevaCaracteristica)
💾 Commit tus cambios (git commit -m 'Add: Nueva característica')
📤 Push a la rama (git push origin feature/NuevaCaracteristica)
🔀 Abre un Pull Request

Ideas de contribución:

Mejorar la UI/UX
Agregar tests unitarios
Optimizar el renderizado
Documentar el código
Agregar más formas predefinidas


📚 Aprendizajes clave
Este proyecto me permitió desarrollar y demostrar:

✅ Dominio de Java Swing para interfaces gráficas
✅ Implementación de patrones de diseño (MVC, Observer)
✅ Manejo de eventos del usuario (mouse, teclado)
✅ Trabajo con Graphics2D para renderizado 2D
✅ Programación Orientada a Objetos aplicada
✅ Estructura de proyecto profesional
✅ Control de versiones con Git/GitHub


📄 Licencia
Este proyecto está bajo la Licencia MIT. Siéntete libre de usar, modificar y distribuir este código.
MIT License - Consulta el archivo LICENSE para más detalles

👤 Autor
Sebastian Guillermo Mamani Guillén

🎓 Estudiante de Ingeniería Empresarial y de Sistemas - Universidad Científica del Sur
💼 LinkedIn: Sebastian Mamani
📧 Email: mamani2sebastian3guillermo@gmail.com
🐙 GitHub: @sebas731


🙏 Agradecimientos

Universidad Científica del Sur - Por la formación en Ingeniería de Sistemas
Comunidad Java - Por los recursos y documentación
NetBeans - Por el excelente IDE para desarrollo Java


📊 Estadísticas del proyecto
Mostrar imagen
Mostrar imagen
Mostrar imagen

<div align="center">
⭐ Si este proyecto te resultó útil, ¡dale una estrella!
Desarrollado con ❤️ y ☕ en Lima, Perú
⬆ Volver arriba
</div>
