import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AlunoService {

  constructor(private http: HttpClient) { }

  public getAllAlunos(){
    let token = localStorage.getItem("isiToken");
    return this.http.get("http://localhost:8080/aluno/todos?token="+token);
  }
}