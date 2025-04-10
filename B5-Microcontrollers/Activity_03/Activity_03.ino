int lampada = 15;

void setup() {
  pinMode(lampada, OUTPUT);
}

void loop() {
    digitalWrite(lampada, HIGH);
    delay(3000);
    digitalWrite(lampada, LOW);
    delay(3000);
}
