from Chimpokomon import Chinpokomon


class interfaseChimpoko :
    def set_vida(vidaAponer):
        pass
    def set_nombre(nombreAPoner):
        pass
    def set_ataques(lista_ataques):
        pass
    def set_naturaleza(naturaleza):
        pass

class BuilderChimpoko(interfaseChimpoko):
    def __init__(self):        
        self.__chimpokomon = None
        self.reset()
    
    def reset(self):
        self.__chimpokomon = Chinpokomon()
    
    def set_vida(self, vidaAponer):
        self.__chimpokomon.set_vida(vidaAponer)
    
    def set_nombre(self, nombreAPoner):
        self.__chimpokomon.set_nombre(nombreAPoner)
    
    def set_ataques(self, lista_ataques):
        self.__chimpokomon.set_lista_ataques(lista_ataques)
    
    def set_naturaleza(self, naturaleza):
        self.__chimpokomon.set_naturaleza(naturaleza)
    
    def resultado(self):
        nuevoChim = self.__chimpokomon
        self.reset()
        return nuevoChim