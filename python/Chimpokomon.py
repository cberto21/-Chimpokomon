from AtaqueConcrete import Ataque

class Chinpokomon:
    def __init__(self) :
        self.vida = 0
        self.vida_actual = 0
        self.naturaleza = None
        self.nombre = ""
        self.lista_ataques = []        
        self.regenero = []
        self.golpe = []
# SETS BUILDER Y GETS
    def set_vida(self, vidaAPoner):
        self.vida = vidaAPoner
        self.vida_actual = vidaAPoner
    def set_naturaleza(self, naturalezaAPoner):
        self.naturaleza = naturalezaAPoner
    def set_nombre(self, nombreAPoner):
        self.nombre = nombreAPoner
    def set_lista_ataques(self, lista_ataques):
        self.lista_ataques.extend(lista_ataques)
    def get_vida_actual(self):
        return self.vida_actual
    def get_naturaleza(self):
        return self.naturaleza
# SET Y GETS DE GOLPES Y REGENERACIONES EN BATALLA
    def set_golpe_recibido(self, num):
        self.golpe.append(num)
    def set_recuperacion_recibido(self, num):
        self.regenero.append(num)
    def golpe_recibido(self):
        if len(self.golpe) >= 1:
            return self.golpe.pop()
        return 0        
    def vida_regenerada(self):
        if len(self.regenero) >= 1:
            return self.regenero.pop()
        return 0    
# ------------------------------------------        
    def modificar_vida(self, modificador): #entrega el minimo valor, pero si recuperas vida y supera a this.vida el maximo es this.vida
        momento = self.vida_actual
        self.vida_actual = min(modificador + self.vida_actual, self.vida)
        if momento > self.vida_actual:
            self.set_golpe_recibido(modificador * -1)


    def atacar_a(self, atacado, ataque):
        if not atacado.esta_muerto():
            atacado.recibir_danio_de(self, ataque)
            
    def recibir_danio_de(self, atacante, ataque):
        self.golpe.append(0)
        self.regenero.append(0)
        ataque.realizar_ataque(self, atacante)
    
    def esta_muerto(self):
        return self.vida_actual <= 0