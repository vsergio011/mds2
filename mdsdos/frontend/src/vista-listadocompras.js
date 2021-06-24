import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';

class VistaListadocompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="height: 100%; padding: var(--lumo-space-l); background-color :#374453; align-items: center;">
  <label style="font-weight: bold; align-self: center; color:white;">Funciones de {usuario/admin}</label>
  <vaadin-button>
    Alta categoria 
  </vaadin-button>
  <vaadin-button>
    Alta producto 
  </vaadin-button>
  <vaadin-button>
    Modificar empleados 
  </vaadin-button>
  <vaadin-button>
    Mensajes 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" style="background-color:white">
   <vaadin-date-picker style="backgroun-color:white"></vaadin-date-picker>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%; padding: var(--lumo-space-l);">
  <vaadin-text-field placeholder="Search" style="width: 100%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-text-area label="Resultados" placeholder="" style="width: 100%; height: 100%;" readonly></vaadin-text-area>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-listadocompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadocompras.is, VistaListadocompras);
