int motor = 15;

void setup() {
  Serial.begin(9600);
  pinMode(motor, OUTPUT);
}

void loop() {
    digitalWrite(motor, HIGH);
    Serial.println("HIGH");
    delay(3000);
    digitalWrite(motor, LOW);
    Serial.println("LOW");
    delay(3000);
}
