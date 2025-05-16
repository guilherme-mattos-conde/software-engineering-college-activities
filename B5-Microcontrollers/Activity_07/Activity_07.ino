#define analog 39

#define led_verde 15
#define led_amarelo 2
#define led_vermelho 4

int valor_analog;

void setup() {
    Serial.begin(9600);
    Serial.println("Lendo dados do sensor...");
    pinMode(led_vermelho, OUTPUT);
    pinMode(led_amarelo, OUTPUT);
    pinMode(led_verde, OUTPUT);
    pinMode(analog, INPUT);
}

void loop() {
   valor_analog = analogRead(analog); 

    digitalWrite(led_vermelho, LOW);
    digitalWrite(led_amarelo, LOW);
    digitalWrite(led_verde, LOW);

   Serial.println(valor_analog);
    if(valor_analog < 1500)
      digitalWrite(led_verde, HIGH);
    else if(valor_analog < 2000)
      digitalWrite(led_amarelo, HIGH);
    else
      digitalWrite(led_vermelho, HIGH);
   delay(1000);
}
