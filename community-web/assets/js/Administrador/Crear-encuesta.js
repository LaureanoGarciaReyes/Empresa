function Crear() {
  Swal.fire({
    title: '¿Qué tipo de pregunta deseas crear?',
    showDenyButton: true,
    confirmButtonText: 'hola',
    confirmButtonText1: 'Checkbox',
    confirmButtonColor: '#19e619',
    denyButtonText: 'Cancelar',

  }).then((result) => {
    /* Read more about isConfirmed, isDenied below */
    if (result.isConfirmed) {
      Swal.fire('¡Guardado!', '', 'success')

    } else if (result.isDenied) {
      Swal.fire('¡Cambio no guardado! ', '', 'error')
    }
  })

}
function Corta() {

  /*-------------SESIÓN-------------------*/

  var sesion = document.createElement('h5');
  sesion.textContent = 'Pregunta'
  sesion.classList.add('m-3')
  Datos.append(sesion);
  
  /*---------Crear pregunta -----------*/
  /*---------Div de contenido completo-----------*/
  var divini = document.createElement('div');
  divini.classList.add('row', 'mt-3');
  Datos.append(divini)

  /*---------Div de contenido input text-----------*/
  var valor1 = document.createElement('div');
  valor1.classList.add('col-sm-12', 'col-md-9', 'col-lg-9');
  divini.append(valor1)

  var pregunta = document.createElement('input');
  pregunta.type = "text"
  pregunta.classList.add('form-control');
  valor1.append(pregunta)
 
  /*---------Div de contenido boton-----------*/
  var valor2 = document.createElement('div');
  valor2.classList.add('col-sm-12', 'col-md-3', 'col-lg-3');
  divini.append(valor2)

  var input1 = document.createElement('button');
  input1.textContent="Guardar"
  input1.style.backgroundColor="red"
  input1.classList.add('form-control');
  valor2.append(input1)


 
}