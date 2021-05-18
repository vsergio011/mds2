import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaListadoempleados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l);">
 <label style="font-weight: bold; align-self: center;">Listado de empleados </label>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; height: 20%;"></vaadin-vertical-layout>
 <vaadin-text-field placeholder="Buscar empleado.." style="width: 50%; align-self: center;" id="vaadinTextField">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-text-field>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; height: 10%;"></vaadin-vertical-layout>
 <vaadin-button id="verEmpleadoBtn" style="align-self: center;">
   Ver 
 </vaadin-button>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; height: 10%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="align-self: center; width: 50%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listadoempleados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoempleados.is, VistaListadoempleados);
