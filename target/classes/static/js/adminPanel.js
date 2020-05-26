$(window).load(function() {

    getAllDoctors(getAllDoctorsCallback);
    getAllPatients(getAllPatientsCallback);
});
var doctorId=0;
var doctors = [];
function editDoctor(id) {
    doctorId=id;
    var doctor = doctors.find(function (doctor){
        return doctor.id === id
    });
    $('#inputName').val(doctor.name);
    $('#inputSpecialty').val(doctor.specialty);
    $('#inputGender').val(doctor.gender);
    $('#inputEducation').val(doctor.education);
    $('#inputJoined').val(doctor.joined);

}
/*function processDoctorsss(doctors) {
    $('#tableDoctors tbody').html("");
    doctors.forEach(function (doctor, index) {

        $('#tableDoctors tbody').append(`
        <tr>
        <td scope="row">` + (index+1) + `</td>
        <td>` + doctor.id + `</td>
        <td>` + doctor.name +`</td>
        <td>` + doctor.specialty + `</td>
        <td>` + doctor.gender + `</td>
        <td>` + doctor.education + `</td>
        <td>` + doctor.joined + `</td>
        <td><img width="200px" src=" ` + hotel.picture +`"></td>
        <td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#addHotel" onclick="editDoctor( ` + doctor.id + `)" ><span class="glyphicon glyphicon-pencil"></span></button></p></td>
        <td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" onclick=" deleteDoctor(` + doctor.id + `,getAllDoctorsCallback )" ><span class="glyphicon glyphicon-trash"></span></button></p></td>
    </tr>
        `);
    });

}*/
function processDoctors(doctors) {
    doctors.forEach(function (doctor, index) {
        $('#tableDoctors tbody').append(`
        <tr>
        <td scope="row">` + (index+1) +`</td>
        <td>` + doctor.id + `</td>
        <td>` + doctor.username + `</td>
        <td>` + doctor.password + `</td>    
        <td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></p></td>
        <td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p></td>
    </tr>
        `);


    })

}

function savePatient(){
    var name = $('#inputName').val();
    var adress = $('#inputAdress').val();
    var city = $('#inputCity').val();
    var age = $('#inputAge').val();
    var condition = $('#inputCondition').val();
    if(name === '' || rating === '' || latitude === '' || longitude ==='' || address ==='' || picture ===''){
        alert("Please fill out each field first")
    } else {

        console.log(name, adress, city, age, condition, picture);
        var hotel = {
            name: name,
            adress: adress,
            city: city,
            age: age,
        }
        if (patientId!=0) putPatient(patient, getAllPatientsCallback, patientId);
        else createPatient(patient, getAllPatientsCallback);
        patientId=0;
        $('#addPatient').modal('hide');
    }
}
function clearForm() {
    $('#inputName').val("");
    $('#inputAdress').val("");
    $('#inputCity').val("");
    $('#inputAge').val("");
    $('#inputCondition').val("");
}

var getAllDoctorsCallback = function(data) {
    doctors = data;
    processDoctors(data);
}
var getAllPatientsCallback = function (data) {
    processPatients(data);
}