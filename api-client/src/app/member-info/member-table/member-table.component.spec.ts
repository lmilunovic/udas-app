import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MemberTableComponent } from './member-table.component';

describe('MemberTableComponent', () => {
  let component: MemberTableComponent;
  let fixture: ComponentFixture<MemberTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MemberTableComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MemberTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
