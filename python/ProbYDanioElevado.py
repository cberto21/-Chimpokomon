import random
from DecoratorAtaques import DecoratorAtaques

class ProbYDanioElevado(DecoratorAtaques):

    def __init__(self, aDecorar, probabilidad, danioElevado) :
        super().__init__(aDecorar)
        self.probabilidad = probabilidad * 0.01
        self.danioElevado = danioElevado
    
    def especial_efecto(self, atacado):
        resultado = 0
        if random.random() >= self.probabilidad:
            resultado = self.get_danio() * self.danioElevado
        else:
            resultado = self.get_danio()        
        return resultado    

    def tiene_efecto(self):
        return True