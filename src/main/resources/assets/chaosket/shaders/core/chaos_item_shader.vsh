#version 150

// Eingabedaten vom Minecraft-Rendering-System
in vec3 Position;    // Position der Vertex-Punkte
in vec2 UV0;         // Texturkoordinaten

// Uniforms, die von Minecraft gesetzt werden
uniform mat4 ProjectionMatrix; // Projektionsmatrix (3D -> 2D)
uniform mat4 ViewMatrix;       // Kameramatrix (Perspektive der Kamera)
uniform mat4 ModelMatrix;      // Transformationsmatrix des Objekts

// Weiterleitung der UV-Koordinaten an den Fragment Shader
out vec2 vTexCoord;

void main() {
    // Position des Vertex nach allen Transformationen berechnen
    gl_Position = ProjectionMatrix * ViewMatrix * ModelMatrix * vec4(Position, 1.0);
    
    // UV-Koordinaten an den Fragment Shader weiterleiten
    vTexCoord = UV0;
}
