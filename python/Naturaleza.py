from Logger import singleton

class Naturaleza():
    def __init__(self):
        self.__ventaja = 0

    def set_ventaja(self, naturaleza) :
        self.__ventaja = naturaleza
    
    def get_ventaja(self):
        return self.__ventaja
    
    def hay_instancia(self):
        return self.__ventaja != None

@singleton    
class Robot(Naturaleza):

    def __init__(self):
        super().__init__()

    def get_ventaja(self):
        if not self.hay_instancia():
            self.set_ventaja(Animal())        
        return super().get_ventaja()

@singleton    
class Animal(Naturaleza):

    def __init__(self):
        super().__init__()
    
    def get_ventaja(self):
        if not self.hay_instancia():
            self.set_ventaja(Cosa())        
        return super().get_ventaja()

@singleton
class Cosa(Naturaleza):  

    def __init__(self):
        super().__init__()
  
    def get_ventaja(self):
        if not self.hay_instancia():
            self.set_ventaja(Robot())        
        return super().get_ventaja()