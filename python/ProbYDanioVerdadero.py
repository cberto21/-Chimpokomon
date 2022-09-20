from math import floor
import random
from DecoratorAtaques import DecoratorAtaques
from Chimpokomon import Chinpokomon

class ProbYDanioVerdadero(DecoratorAtaques):

    def __init__(self, aDecorar, probabilidad, porcentajeDanioVerdadero) :
        super().__init__(aDecorar)
        self.probabilidad = probabilidad * 0.01
        self.porcentajeDanioVerdadero = porcentajeDanioVerdadero * 0.01
    
    def especial_efecto(self, atacado):
        resultado = 0
        if random.random() <= self.probabilidad:
            resultado = floor(atacado.get_vida_actual() * self.porcentajeDanioVerdadero)
        else:
            resultado = self.get_danio()
        
        return resultado
    

    def tiene_efecto(self):
        return True