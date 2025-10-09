int led_verde = 4;
int led_vermelho = 15;
int sensor = 33;

void setup() {
  Serial.begin(9600);
  pinMode(sensor, INPUT);
  pinMode(led_verde, OUTPUT);
  pinMode(led_vermelho, OUTPUT);
  
  digitalWrite(led_verde, LOW);
  digitalWrite(led_vermelho, LOW);
}

void loop() {
  int s = digitalRead(sensor);

  if(s == HIGH) {
    digitalWrite(led_verde, HIGH);
    digitalWrite(led_vermelho, LOW);
    Serial.println("Movimento detectado!");
    delay(2000);
  } else {
    digitalWrite(led_verde, LOW);
    digitalWrite(led_vermelho, HIGH);
  }

  delay(100);
}
