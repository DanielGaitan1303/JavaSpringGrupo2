## Punto 3
El punto 3 consiste en tener dos estrategias de descuento Premium y basica, donde necesitamos que el contenedor de inversion de control 
sepa cual estrategia usar gracias a la notacion primary, Qualifier y autowired que le permiten especificar cual bean usar. 

Primary
Con la notacion primary le ayudamos a que el contenedor de Inversion de control eliga por defecto a cual  Bean inyectarle las dependencias, cuando se tiene beans del mismo tipo.
 Sino especficamos el programa lanza un error de compilacion por que Spring no sabe cual de los 2 utilizar.

Quealifier
Con la notacion Qualifier nosotors  podemos indicarle al contenedor cual de los Beans debe escoger, si les damos nombres diferentes el 
Framework va a saltar un error por que no encuentra el Bean.

Autowired (required==False)
Esta notacion nos ayuda a que si un bean no existe en el contenedor de inversion de control, el programa no nos genera ningun error.
