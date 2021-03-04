import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

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
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 50%; height: 100%; padding: var(--lumo-space-l);">
  <label style="font-weight: bold; align-self: stretch; ">Funciones de {usuario/admin}</label>
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
  <vaadin-date-picker></vaadin-date-picker>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 50%; padding: var(--lumo-space-l);">
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
