#include <OneWire.h>
#include <DallasTemperature.h>

#define dados 15

OneWire oneWire(dados);
DallasTemperature sensor(&oneWire);

void setup() { 
 Serial.begin(9600);
 pinMode(dados, INPUT_PULLUP);
 sensor.begin();
}

void loop() { 
  if(sensor.getDeviceCount() == 0) {
    Serial.println("Nenhum sensor encontrado!");
  } else {
  sensor.requestTemperatures();
  Serial.print("Temperatura: ");
  Serial.print(sensor.getTempCByIndex(0));
  Serial.println("°C");
  }
  delay(1000);
}
