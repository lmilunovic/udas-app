import { Component } from '@angular/core';

import { MatFormField, MatFormFieldModule } from '@angular/material/form-field';
import { MatLabel } from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';

import { MatInputModule
  
 } from '@angular/material/input';
@Component({
  selector: 'app-search-filters',
  standalone: true,
  imports: [FormsModule, MatFormField, MatLabel, MatInputModule],
  templateUrl: './search-filters.component.html',
  styleUrl: './search-filters.component.css'
})
export class SearchFiltersComponent {

}
