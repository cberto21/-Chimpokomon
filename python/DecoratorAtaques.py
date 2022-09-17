from AtaqueConcrete import Ataque


class DecoratorAtaques (Ataque) :
    def __init__(self, aDecorar):
        self.__decorado = aDecorar
    
    def get_nombre(self):
        return self.__decorado.get_nombre()
    def get_danio(self):
        return self.__decorado.get_danio()
    def get_recupera(self):
        return self.__decorado.get_recupera()
    def get_ventaja(self):
        return self.__decorado.get_ventaja()
    
    def realizar_ataque(self, atacado, atacante):
        if (self.tiene_efecto()):
            atacado.modificar_vida( - self.especial_efecto(atacado) )
        else:
            self.__decorado.realizar_ataque(atacado,atacante)
    
    def tiene_ventaja(self, atacado, atacante):
        return self.__decorado.tiene_ventaja(atacado,atacante)
    
    def tiene_efecto(self):
        return False
    def especial_efecto(self, atacado):
        return -1