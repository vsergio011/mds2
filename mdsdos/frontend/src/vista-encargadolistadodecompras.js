import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaEncargadolistadodecompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%

                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-xl);">
  <label>Seleccionar compras por:</label>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-button id="btnNuevo" style="border:solid; width: 100%;">
     Nuevo 
   </vaadin-button>
   <vaadin-button id="btnEnviado" style="border:solid; width: 100%;">
     Enviado 
   </vaadin-button>
   <vaadin-button id="btnRecibido" style="width: 100%;border:solid">
     Recibido 
   </vaadin-button>
   <vaadin-button id="btnFecha" style="width: 100%;border:solid">
     Fecha 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-date-picker id="inputdate"></vaadin-date-picker>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-xl);">
  <vaadin-horizontal-layout style="width: 100%;">
   <vaadin-text-field placeholder="Search" style="width: 70%;" id="inputSearch">
    <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
   </vaadin-text-field>
   <vaadin-button id="filtrarBtn" style="width: 30%;">
    Filtrar
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="contenedorPedidos" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-encargadolistadodecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadolistadodecompras.is, VistaEncargadolistadodecompras);
