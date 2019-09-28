#include "agentevoid.h"

AgenteVoid::AgenteVoid(GenCarga& genCarga)
  : Sincronizador(), genCarga(genCarga) { }

AgenteVoid::~AgenteVoid() { }

void AgenteVoid::arrancar(LavadoraID lavadoraID, int carga) {
}

void AgenteVoid::parar(LavadoraID lavadoraID) {
}
