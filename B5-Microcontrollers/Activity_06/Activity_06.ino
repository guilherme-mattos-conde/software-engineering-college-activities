#include <Ultrasonic.h>

#define pino_trigger 22
#define pino_echo 23
#define led_verde 15
#define led_amarelo 2
#define led_vermelho 4

Ultrasonic ultrasonic(pino_trigger, pino_echo);
int distance;

void setup() {
  Serial.begin(9600);
  Serial.println("Lendo dados do sensor...");
  pinMode(led_vermelho, OUTPUT);
  pinMode(led_amarelo, OUTPUT);
  pinMode(led_verde, OUTPUT);
  
}

void loop() {
  distance = ultrasonic.read();

  Serial.print("Distancia em cm: ");
  Serial.println(distance);

  digitalWrite(led_vermelho, LOW);
  digitalWrite(led_amarelo, LOW);
  digitalWrite(led_verde, LOW);

  if(distance < 5) {
    digitalWrite(led_vermelho, HIGH);
  } else if(distance < 10) {
    digitalWrite(led_amarelo, HIGH);
  } else {
    digitalWrite(led_verde, HIGH);
  }
  delay(1000);
}
