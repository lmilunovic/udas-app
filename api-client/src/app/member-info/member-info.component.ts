import { Component } from '@angular/core';
import { SearchFiltersComponent } from './search-filters/search-filters.component';
import { MemberTableComponent } from './member-table/member-table.component';

@Component({
  selector: 'app-member-info',
  standalone: true,
  imports: [SearchFiltersComponent, MemberTableComponent],
  templateUrl: './member-info.component.html',
  styleUrl: './member-info.component.css',
})
export class MemberInfoComponent {}
