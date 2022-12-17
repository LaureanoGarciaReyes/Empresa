function  AgregarUs(){
    document.getElementById("Nombre").disabled = false;
    document.getElementById("Apellidos").disabled = false;
    document.getElementById("Matricula").disabled = false;
    document.getElementById("Correo").disabled= false;
    document.getElementById("check").disabled= false;
    document.getElementById("SE-Grupo").disabled= false;
    document.getElementById("AgregarID").disabled= false;
    
}
function Guardar(){
   
    Swal.fire({
        title: '¿Desea guardar los cambios?',
        showDenyButton: true,
        confirmButtonText: 'Guardar',
        confirmButtonColor: '#19e619',
        denyButtonText: 'Cancelar',
        icon:'question',
      }).then((result) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
         Swal.fire('¡Guardado!', '', 'success')
          document.getElementById("Nombre").disabled = true;
          document.getElementById("Apellidos").disabled = true;
          document.getElementById("Matricula").disabled = true;
          document.getElementById("Correo").disabled= true;
          document.getElementById("SE-Grupo").disabled= true;
          document.getElementById("check").disabled= true;
          document.getElementById("AgregarID").disabled= true;
          

        } else if (result.isDenied) {
          Swal.fire('¡Cambio no guardado! ', '', 'error')
        }
      })
    
}
function Eliminar(){
     
    Swal.fire({
        title: '¿Esta seguro de eliminar el registro?',
        text: "¡No podrá revertir esta acción!",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#19e619',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Confirmar',
        cancelButtonText: 'Cancelar'
      }).then((result) => {
        if (result.isConfirmed) {
          Swal.fire(
            '¡Eliminado!',
            'El registro ha sido eliminado',
            'success'
            
          )
        }
      })
}
function Grupo2(){

  document.getElementById('Grupo2').style.display='';
  document.getElementById('SE-Grupo2').disabled=false;
}
function AceptarMod(){
  document.getElementById("Nombre").disabled = false;
  document.getElementById("Matricula").disabled = false;
  document.getElementById("Correo").disabled= false;
  document.getElementById("SE-Grupo").disabled= false;
  document.getElementById("SE-Grupo2").disabled= false;
  document.getElementById("AgregarID").disabled= false;
  document.getElementById('btnBorrar').style.display='';
  
}