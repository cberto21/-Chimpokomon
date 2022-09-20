from Logger import Logger
from CreadorDirector import CreadorDirector
from InterfaceChimpoko import BuilderChimpoko
from NumAleatorio import NumAleatorio
from Error import Error
from Debug import Debug
from Warn import Warn
from Info import Info

builder = BuilderChimpoko()
creadorDirector = CreadorDirector(builder)

carnotron = creadorDirector.crear_carnotron()
gallotronix = creadorDirector.crear_gallotronix()
zapato = creadorDirector.crear_zapato()
zapatoEspecial = creadorDirector.crear_zapato_especial()
rooster = creadorDirector.crear_rooster()
log = Logger(Info())

def gestionarBatallas(peleadorA, peleadorB, logger):

    while not peleadorA.esta_muerto() and not peleadorB.esta_muerto():
        numAtaqueA = NumAleatorio.aleatorio(len(peleadorA.lista_ataques)-1)
        numAtaqueB = NumAleatorio.aleatorio(len(peleadorB.lista_ataques)-1)

        peleadorB.atacar_a(peleadorA, peleadorB.lista_ataques[numAtaqueB])
        peleadorA.atacar_a(peleadorB, peleadorA.lista_ataques[numAtaqueA])        
        
        logger.debug( peleadorA.nombre +" Ataco a:" + peleadorB.nombre)
        logger.debug( peleadorB.nombre +" Ataco a:" + peleadorA.nombre)

        logger.info( peleadorA.nombre +" Regenero:"+ str(peleadorB.vida_regenerada()) )
        logger.info( peleadorB.nombre +" Regenero:"+ str(peleadorA.vida_regenerada()) )

        logger.warn( peleadorA.nombre +" Hizo Daño:"+ str(peleadorB.golpe_recibido()))
        logger.warn( peleadorB.nombre +" Hizo Daño:"+ str(peleadorA.golpe_recibido()))

        logger.error( peleadorA.nombre +" Vida actual:"+ str(peleadorA.get_vida_actual()) )
        logger.error( peleadorB.nombre +" Vida actual:"+ str(peleadorB.get_vida_actual()) )

        print("duelo")
    
    if peleadorB.esta_muerto():
        logger.error(peleadorA.nombre + " Winner")
    elif peleadorA.esta_muerto():
        logger.error(peleadorB.nombre + " Winner")

gestionarBatallas(carnotron, zapatoEspecial, log)