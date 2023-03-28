$(document).ready(function(){

    $('#Ver').on('click',function(){
        let tabla =document.querySelector('#tablita')
        tabla.innerHTML = '';
        tabla.innerHTML = '<thead><th>Codigo</th><th>Nombre</th><th>Apellido</th><th>Materias</th><th>Notas</th><th>Definitiva</th><th>Juicio</th></thead>';
        $.ajax({
            url:"https://localhost:8080/aprobacionEstudiantes",
            type:"GET",
            dataType:"JSON",
            success: function(respuesta){
                console.log(respuesta);
                for (i= 0; i <= respuesta.length; i++){
                    tabla.innerHTML += '<tr><td>' + respuesta[i].codigo + 
                    '</td><td>' + respuesta[i].nombre  + 
                    '</td><td>' + respuesta[i].apellido + 
                    '</td><td>' + respuesta[i].materia1 + 
                    '</td><td>' + respuesta[i].materia2 + 
                    '</td><td>' + respuesta[i].materia3 + 
                    '</td><td>' + respuesta[i].Nota1 + 
                    '</td><td>' + respuesta[i].Nota2 + 
                    '</td><td>' + respuesta[i].Nota3 + 
                    '</tr>'

                }
            }
        });
    });



    $('#Agregar').on('click', function(){
       
        materias = [$('#Materia1').val(),$('#Materia2').val(),$('#Materia3').val()];
        notas = [$('#Nota1').val(),$('#Nota2').val(),$('#Nota3').val()]

        let datos = {
            codigo : parseInt($('#codigo').val()),
            nombre : $('#nombre').val(),
            apellido : $('#apellido').val(),
            materias,
            notas

        }
        console.log(datos);

        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
        $.ajax({
            url: "https://localhost:8080/insertarEstudiantes",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            datatype:"JSON",
            success: function(respuesta){
                alert(respuesta)
            }
        });
       
    });

});