/* Muestra la barra de navegación, y el icono de cerrar, y oculta el
   de menú hamburguesa */
function mostrar(elemento,abrir,cerrar){
           /* aparece la barra */
           elto=document.getElementById(elemento);
           elto.style.display="block";
           /* desaparece icono hamburguesa */
           abr=document.getElementById(abrir);
           abr.style.display="none";
           /* aparece icono cerrar */
           cerr=document.getElementById(cerrar);
           cerr.style.display="inline";
       }
/* Menú Hamburguesa

           elto=document.getElementById(elemento);
           elto.style.display="none";
           /* desaparece icono hamburguesa */
           abr=document.getElementById(abrir);
           abr.style.display="inline";
           /* aparece icono cerrar */
           cerr=document.getElementById(cerrar);
           cerr.style.display="none";
       }