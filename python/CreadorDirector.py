from AtaqueConcrete import AtaqueConcret, Ataque
from Naturaleza import Robot, Cosa, Animal
from PomadaWassington import PomadaWassington
from ProbYDanioElevado import ProbYDanioElevado
from ProbYDanioVerdadero import ProbYDanioVerdadero


class CreadorDirector:
    def __init__(self, builder):
        self.__builder_chimpoko = builder
    
    def crear_gallotronix(self):
        self.__builder_chimpoko.set_nombre("Gallotronix")
        self.__builder_chimpoko.set_vida(25)
        self.__builder_chimpoko.set_ataques([self.crear_garra_mecanica()])
        self.__builder_chimpoko.set_naturaleza(Robot())
        return self.__builder_chimpoko.resultado()
    
    def crear_zapato(self):
        self.__builder_chimpoko.set_nombre("Zapato")
        self.__builder_chimpoko.set_vida(30)
        self.__builder_chimpoko.set_ataques([self.crear_zapatazo()])
        self.__builder_chimpoko.set_naturaleza(Cosa())
        return self.__builder_chimpoko.resultado()
    
    def crear_zapato_especial(self):
        self.__builder_chimpoko.set_nombre("ZapatoEspecial")
        self.__builder_chimpoko.set_vida(30)
        self.__builder_chimpoko.set_ataques([self.crear_zapatazo(), self.crear_pomada_wassington()])
        self.__builder_chimpoko.set_naturaleza(Cosa())
        return self.__builder_chimpoko.resultado()
    
    def crear_carnotron(self):
        self.__builder_chimpoko.set_nombre("Carnotron")
        self.__builder_chimpoko.set_vida(20)
        self.__builder_chimpoko.set_ataques([self.crear_rayo_veloz(), self.crear_canion_conico()])
        self.__builder_chimpoko.set_naturaleza(Animal())
        return self.__builder_chimpoko.resultado()
    
    def crear_rooster(self):
        self.__builder_chimpoko.set_nombre("Rooster")
        self.__builder_chimpoko.set_vida(60)
        self.__builder_chimpoko.set_ataques([self.crear_zapatazo(),self.crear_rayo_veloz(), self.crear_canion_conico(),self.crear_garra_mecanica(),self.crear_pomada_wassington()])
        self.__builder_chimpoko.set_naturaleza(Robot())
        return self.__builder_chimpoko.resultado()

    def crear_garra_mecanica(self):
        ataqueNuevo = AtaqueConcret("Garra Mecanica", 2, 0, 2)
        return ProbYDanioElevado( ataqueNuevo , 50, 2)
    
    def crear_zapatazo(self):
        ataqueNuevo = AtaqueConcret("Zapatazo", 1, 0, 3)
        return ProbYDanioVerdadero( ataqueNuevo ,10, 50)
    
    def crear_pomada_wassington(self):
        ataqueNuevo = AtaqueConcret("Pomada Wassington", 0, 5, 1)
        return PomadaWassington(ataqueNuevo)
    
    def crear_rayo_veloz(self):
        return AtaqueConcret("Rayo Veloz", 3, 0, 1)
    
    def crear_canion_conico(self):
        return AtaqueConcret("Canion Conico", 4, 0, 1)