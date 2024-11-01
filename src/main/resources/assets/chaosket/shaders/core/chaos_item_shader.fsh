#version 150

// Eingabedaten vom Vertex Shader
in vec2 vTexCoord;

// Die Textur des Items
uniform sampler2D Texture;

// Uniform für die Zeit (um Animationseffekte zu erstellen)
uniform float Time;

// Ausgabe-Farbe
out vec4 FragColor;

void main() {
    // Hole die Farbe des Pixels aus der Textur
    vec4 texColor = texture(Texture, vTexCoord);
    
    // Füge einen animierten Glüheffekt basierend auf der Zeit hinzu
    float glow = 0.5 + 0.5 * sin(Time * 2.0); // Schwingt zwischen 0 und 1

    // Multipliziere die Texturfarbe mit dem Glow-Effekt
    vec4 finalColor = texColor * vec4(1.0, 1.0, glow, 1.0);
    
    // Setze die Ausgabe-Farbe
    FragColor = finalColor;
}
