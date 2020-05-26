function  getAllDoctors(callback) {
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/api/doctor',
        success: function (data) {
            callback(data);

        } ,
        error: function (request, status, error) {
            alert(error);

        }
    })
}
function createDoctor(doctor, callback){

    $.ajax({
        type: 'POST',
        url: 'http://localhost:8080/api/doctor',
        contentType: "application/json",
        data: JSON.stringify(doctor),
        success: function (msg) {
            getAllHotels(callback);
        },
        error: function (request, status, error) {
            alert(error);
        }
    });
}
function putDoctor(doctor, callback, hotelId) {
    $.ajax({
        type: 'PUT',
        url: 'http://localhost:8080/api/doctor/' + doctorId,
        contentType: "application/json",
        data: JSON.stringify(doctor),
        success: function (data) {
            getAllDoctors(callback);
        },
        error: function (request, status, error) {
            alert(error);
        }
    })


}
function deleteDoctor(id, callback) {
    $.ajax({
        type: 'DELETE',
        url: 'http://localhost:8080/api/doctor/' + id,
        success: function (data) {
            getAllDoctors(callback);
        },
        error: function (request, status, error) {
            alert(error);
        }
    })

}

function  getAllPatients(callback) {
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/api/patient',
        success: function (data) {
            callback(data);
        } ,
        error: function (request, status, error) {
            alert(error);

        }
    })
}
function  getPatientByUsername(callback) {
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/api/patient/id',
        success: function (data) {
            callback(data);
        } ,
        error: function (request, status, error) {
            alert(error);

        }
    })
}
